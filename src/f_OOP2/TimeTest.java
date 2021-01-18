package f_OOP2;

public class TimeTest {
	public static void main(String[] args) {

		TimeVO tm = new TimeVO();
		tm.setSecond(11423);
		tm.setMinute(1434);
		tm.setHour(22);

		int hour = tm.getHour();
		int minute = tm.getMinute();
		int seconds = tm.getSeconds();

		System.out.println(hour + " : " + minute + " : " + seconds);

		// 시간 6
		// 분 356 => 11시 56분 0~59분
		// 초 7200 + 60 + 53 = 7313 = 13시 57분 53초

		// 시간 22
		// 분 1434 => 21시 54분
		// 초 10800 + 600 + 23 => 11423 => 1시 4분 23초

	}
}

class TimeVO { // 시간을 관리하기 위한 박스
	private int hour;
	private int minute;
	private int seconds;

	void setHour(int hour) { //단축키 알트+쉬프트 에스 -> 알 -> 알트 에이 -> 쉬프트 탭
		this.hour += hour;
		this.hour %= 24;
	}

	int getHour() {
		return hour;
	}

	void setMinute(int minute) {
		this.minute += minute;
		this.hour += this.minute / 60;
		this.minute %= 60;
	}

	int getMinute() {
		return minute;
	}

	void setSecond(int seconds) {
		this.seconds = seconds % 60;
		this.minute = seconds / 60;
	}

	int getSeconds() {
		return seconds;
	}

}