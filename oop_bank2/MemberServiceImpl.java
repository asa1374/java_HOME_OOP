package oop_bank2;

public class MemberServiceImpl implements MemberService{

	@Override
	public MemberBean join(String id, String pass, String name, String ssn) {
		MemberBean bean = new MemberBean();
		bean.setId(id);
		bean.setPass(pass);
		bean.setName(name);
		bean.setSsn(ssn);
		return bean;
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
}
