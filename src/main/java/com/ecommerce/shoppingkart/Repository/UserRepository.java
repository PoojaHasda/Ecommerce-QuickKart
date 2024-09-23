package com.ecommerce.shoppingkart.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.shoppingkart.Model.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer>  {
    public UserDetails findByEmail(String email);

	public List<UserDetails> findByRole(String role);

	public UserDetails findByResetToken(String token);

	public Boolean existsByEmail(String email);
}
