package com.example.usermanagement.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.usermanagement.exception.ResourceNotFoundException;
import com.example.usermanagement.model.User;
import com.example.usermanagement.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

  
	@Override
	public User createUser(User user) {
		
		 return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public   User getUserById(Long id) {
		
		return userRepository.findById(id)
		        .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
	}

	@Override
	public User updateUser(Long id, User user) {
		// TODO Auto-generated method stub
		User existingUser = userRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));

	    existingUser.setName(user.getName());
	    existingUser.setEmail(user.getEmail());
	    
	    return userRepository.save(existingUser);
	}

	@Override
	public String deleteUser(Long id) {
		userRepository.deleteById(id);
		
		return "User Deleted Successfully";
		
		
	}  
}
