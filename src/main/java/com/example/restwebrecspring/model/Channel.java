package com.example.restwebrecspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getters and setters for all member properties
@AllArgsConstructor // One constructor with all the member properties
@NoArgsConstructor
@Entity(name = "channel")
public class Channel {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "channel_seq")
  private Long id;
  private String title;

}
