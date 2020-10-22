package com.eomcs.pms.domain;

import java.util.Date;

public class Player {
  private int no;
  private String name;
  private String stage;
  private Date RegisteredDate;

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getName() {
    return name;
  }
  public void setName(String title) {
    this.name = title;
  }
  public String getStage() {
    return stage;
  }
  public void setStage(String stage) {
    this.stage = stage;
  }
  public Date getRegisteredDate() {
    return RegisteredDate;
  }
  public void setRegisteredDate(Date registeredDate) {
    RegisteredDate = registeredDate;
  }


}






