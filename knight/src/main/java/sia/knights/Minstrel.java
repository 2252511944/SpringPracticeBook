package sia.knights;

import java.io.PrintStream;

/**
 * 游吟诗人类记载骑士的所有事迹
 * 一个POJO的切面，切面是去执行别人的方法
 */
public class Minstrel {

  private PrintStream stream;



  public Minstrel(PrintStream stream) {
    this.stream = stream;
  }

  public void singBeforeQuest() {
    System.out.println("*****singBeforeQuest***");
    stream.println("Fa la la, the knight is so brave!");
  }

  public void singAfterQuest() {
    stream.println("Tee hee hee, the brave knight " +
    		"did embark on a quest!");
  }

}
