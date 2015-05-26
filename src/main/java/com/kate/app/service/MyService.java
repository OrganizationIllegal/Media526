package com.kate.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.MyDb;
import com.kate.app.dao.NewsTrendsDAO;
import com.kate.app.dao.testD;
import com.kate.app.model.NewsTrends;

@Service
public class MyService {
	@Autowired
    private MyDb myDb;
	@Autowired
	private testD t;
	
	@Autowired
    private NewsTrendsDAO newsTrendsDAO;
	
	
	/*@Autowired
    private HouseProjectDao houseProjectDao;*/
	
	public int test(){
		NewsTrends object = newsTrendsDAO.findById(1);
		return object.getId();
	}
	
	public int test_H(){
		int size = myDb.findInfo().size();
		return size;
	}
	/*@Autowired
    private MyDb iconDb;
	
	public List<MyIcon> getIcon(int pageNum, int pageSize){
		List<MyIcon> list = new ArrayList<MyIcon>();    //从数据库取出所有list
		List<MyIcon> temp = new ArrayList<MyIcon>();
		list=iconDb.test();
		
		if(list!=null){
			if(pageNum<1){
				pageNum = 1;
			}
			if(pageSize<1){
				pageSize = 1;
			}
			for(int i = (pageNum-1)*pageSize; i <= pageNum*pageSize-1; i++){
				temp.add(list.get(i));
			}
		}
		return temp;
	}
	public String test(){
		
		
		//return json.toJSONString();
	}
	
	@Autowired
    private IconDb iconDb;
	
	protected static final Logger logger = LoggerFactory.getLogger(MyIconService.class);

	public void getMyIcon(){
		iconDb.findIcon();
	}
	
	public void addMyIcon(){
		System.out.println("fefefefef");
		iconDb.addIcon();
	}*/

}
