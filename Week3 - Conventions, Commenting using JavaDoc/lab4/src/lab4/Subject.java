package lab4;

public abstract class Subject implements Delivery{
	public String tutor, room, subName;
	public int credit;
	
	@Override
	public String getTutor() {
		return tutor;
	}

	@Override
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	@Override
	public String getRoom() {
		return room;
	}

	@Override
	public void setRoom(String room) {
		this.room = room;
	}
	
	@Override
	public String getSubName() {
		return subName;
	}
	
	@Override
	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	public String classSlot() {
		return "|\t" + subName + "\t|\t" + credit + "\t|\t" + tutor + "\t|\t" + room + "\t|\n";
	}
	
	public abstract int getCredit(); // polymorphic method for getCredit
}
