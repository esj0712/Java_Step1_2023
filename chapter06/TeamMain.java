package chapter06;

import java.lang.reflect.Member;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup  team=new TeamGroup();
		TeamMember  t= new TeamMember();
		
		//�޼ҵ带 ���ؼ� ������ �ʱ�ȭ
		
		t.setTeamName("7��8D");
		System.out.println("���� : "+t.getTeamName());
		System.out.println("----------| ���� ��� |----------");
		team.init();
		team.Disp();
		
        System.out.println();
        t.setmName("��â��");
        t.setMphone("010-0000-0000");
        t.setsName("�̼���");
        System.out.println("���� : "+t.getmName(null));
        System.out.println("���� ��ȣ : "+t.getMphone());
        System.out.println("������ : "+t.getsName());
        
	}

}
