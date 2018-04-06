package part10;

//import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

//@Component("board")
public class BoardCafe implements Board{
	private Write write;
	
	//@Resource(name = "qnaWrite")
	@Autowired
	public void setWrite(Write write){
		this.write = write;
	}

	public void boardWrite(){
		write.doWrite();
	}
}
