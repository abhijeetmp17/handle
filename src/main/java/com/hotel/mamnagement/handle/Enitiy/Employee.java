package com.hotel.mamnagement.handle.Enitiy;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Data
@NoArgsConstructor
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer identityNo;

    @NotBlank(message = "Employee Name must not be empty")
    private String empName;

    @NotBlank(message = "Employee email must not be empty")
    @Email
    private String empEmail;


    @NotBlank(message = "Employee User name must not be empty")
    private String empUserName;


    @Transient // meaning it will not be saved in DB
    @Size(min=5, max=15, message="{register.password.size}")
    private String plainPassword; //unencrytped

    @Transient
    private String repeatPassword;

    @Column(name="password", length=60)
    private String empPassword;


    public void setPlainPassword(String plainPassword) {
        //System.out.println("PASSWORD BEFORE " + plainPassword);
        this.empPassword = new BCryptPasswordEncoder().encode(plainPassword);
        //System.out.println("HERE IS PASSWORD" + this.password + "PASSWORD LENGTH = " + (this.password).length());
        this.plainPassword = plainPassword;
    }



}
