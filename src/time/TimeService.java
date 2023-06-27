package time;

import java.text.SimpleDateFormat;

public class TimeService {
	
	private TimeDTO dto;
	public TimeService() {
		dto = new TimeDTO();
	}
	
	public void setStartTime() {
		System.out.println("서비스 시간 설정");
		long start = System.currentTimeMillis();
		dto.setStart(start);
	}
	public String getStartTime() {
//		System.out.println(dto.getStart());
		//위에껄 출력하면 초로 계산되어 나옴
		SimpleDateFormat s = 
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String sTime = s.format(dto.getStart());
		return sTime;
	}
	public void setEndTime() {
		System.out.println("종료 시간 설정");
		long end = System.currentTimeMillis();
		dto.setEnd(end);
		dto.setTotal( (end-dto.getStart())/1000 );
	}
	public String getEndTime() {
//		System.out.println(dto.getStart());
		//위에껄 출력하면 초로 계산되어 나옴
		SimpleDateFormat s = 
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String eTime = s.format(dto.getEnd());
		
		
		return eTime;
	}
	public String getResultTime() {
//		System.out.println(dto.getTotal()+"초 사용");
		
		long total = dto.getTotal();
		int m = (int)total / 60;
		int s = (int)total % 60;
//		System.out.println(m+"분 "+s+"초 사용");
		//출력은 메인에서
		
		return m+"분 "+s+"초 사용";
		
	}
	

}
