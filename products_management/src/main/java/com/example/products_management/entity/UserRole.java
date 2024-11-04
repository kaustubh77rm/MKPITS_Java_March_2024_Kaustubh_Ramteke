package com.example.products_management.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_roles")
public class UserRole {

    @EmbeddedId
    private UserRoleId id;  // composite key (user_id, role_id)

    @Embeddable
    @Getter
    @Setter
    public static class UserRoleId implements java.io.Serializable {
        @Column(name = "user_id")
        private int userId;

        @Column(name = "role_id")
        private int roleId;

        public UserRoleId(int userId, int roleId) {
            this.userId = userId;
            this.roleId = roleId;
        }

        public UserRoleId() {}
    }

    public UserRole(int userId, int roleId) {
        this.id = new UserRoleId(userId, roleId);
    }
}