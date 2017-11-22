package quickfulfill.domain.objects;



/** 
 * This class only for initial demo.
 * @author 1194-Techouts
 *@since 14-12-2016
 */
public class DemoDto {

	String title;
	String singer;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Track [title=" + title + ", singer=" + singer + "]";
	}

}
