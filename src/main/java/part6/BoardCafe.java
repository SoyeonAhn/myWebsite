package part6;

import org.springframework.beans.factory.annotation.Autowired;

import part5.Write;

public class BoardCafe implements Board{
	
	@Autowired
	private Write write;
	/*public void setWrite(Write write){
		this.write = write;
	}
	*/
	public void boardWrite(){
		write.doWrite();
	}

}
