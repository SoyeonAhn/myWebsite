package part4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {
	public static void main(String[] args){
		ApplicationContext ac = new GenericXmlApplicationContext("spring/config4.xml");
		
		Board board = ac.getBean("board", Board.class);
		//Board board = (Board)ac.getBean("board");
		board.boardWrite();
	}
}
