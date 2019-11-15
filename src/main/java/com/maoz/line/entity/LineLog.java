package com.maoz.line.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "line_log")
@Data
public class LineLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long runningNo;
    private String userId;
    private String messageData;
    private Date createdDate;
}
