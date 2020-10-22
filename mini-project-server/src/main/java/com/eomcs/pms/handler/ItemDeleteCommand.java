package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import com.eomcs.pms.domain.Item;
import com.eomcs.util.Prompt;

// delete
public class ItemDeleteCommand implements Command {

  List<Item> InventoryList;

  public ItemDeleteCommand(List<Item> list) {
    this.InventoryList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
      out.println("[아이템 삭제]");
      int no = Prompt.inputInt("아이템 번호? ", out, in);
      int index = indexOf(no);

      if (index == -1) {
        out.println("해당 번호의 아이템이 없습니다.");
        return;
      }

      String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ", out, in);
      if (!response.equalsIgnoreCase("y")) {
        out.println("아이템 삭제를 취소하였습니다.");

        return;
      }

      InventoryList.remove(index);
      out.println("아이템을 삭제하였습니다.");
      out.println("'/move/hallway' 명령어를 이용해 복도로 이동합니다.");

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }

  private int indexOf(int no) {
    for (int i = 0; i < InventoryList.size(); i++) {
      Item inventory = InventoryList.get(i);
      if (inventory.getNo() == no) {
        return i;
      }
    }
    return -1;
  }
}
