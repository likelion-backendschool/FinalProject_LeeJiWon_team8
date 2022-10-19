package com.ll.exam.FinalMutBooks.app.member.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ll.exam.FinalMutBooks.app.base.entity.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Member extends BaseEntity {
    @Column(unique = true)
    private String username;
    @JsonIgnore
    private String password;
    private String nickname;
    private String email;
}