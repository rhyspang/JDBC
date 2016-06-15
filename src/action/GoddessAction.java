package action;

import java.util.Date;
import java.util.List;

import dao.GoddessDao;
import model.Goddess;

public class GoddessAction {
	
	public static void main(String[] args) throws Exception {
		GoddessDao g = new GoddessDao();
		List<Goddess> gs = g.query();
		for(Goddess goddess : gs) {
			System.out.println(goddess.getUser_name() + "," + goddess.getAge());
		}
		
		Goddess g1 = new Goddess();
		g1.setUser_name("Сmei");
		g1.setAge(18);
		g1.setSex(1);
		g1.setBirthday(new Date());
		g1.setEmail("xiaoxia_update@pash.com");
		g1.setMobile("17788889999");

		g1.setUpdate_user("admin");
		g1.setIsdel(1);
		g1.setId(3);
		//g.addGoddess(g1);
		
		System.out.println(g.get(1));
	}
}
