package com.example.demo.domain.stacks;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;


@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class CSharp extends StackBase {
}
