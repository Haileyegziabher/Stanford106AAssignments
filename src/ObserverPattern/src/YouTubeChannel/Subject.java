package YouTubeChannel;

public interface Subject {
	public void registerObserver(Observer ob);
	public void removeObserver(Observer ob);
	void notifyObservers();

}
