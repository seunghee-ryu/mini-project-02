package com.eomcs.pms.listener;

import java.util.Map;
import com.eomcs.context.ApplicationContextListener;

public class AppInitListener implements ApplicationContextListener {
  @Override
  public void contextInitialized(Map<String,Object> context) {
    System.out.println("플레이어가 게임에 접속했습니다.");
  }

  @Override
  public void contextDestroyed(Map<String,Object> context) {
    System.out.println("플레이어가 게임을 종료했습니다.");
  }
}
