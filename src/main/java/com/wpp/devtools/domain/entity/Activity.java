package com.wpp.devtools.domain.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name = "activity")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Activity {

  @Id
  @GeneratedValue(generator = "jpa-uuid")
  private String id;
  private String name;
  private long sort;
  private boolean enabled;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;

}
