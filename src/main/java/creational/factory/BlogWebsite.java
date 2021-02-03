package creational.factory;

public class BlogWebsite extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
	}

}
