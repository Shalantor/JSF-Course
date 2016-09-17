import java.io.IOException;
import java.net.URLEncoder;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

@ManagedBean
public class Search {
	
	private String keyword;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public String forward() throws IOException{
		String searchString = URLEncoder.encode(keyword,"utf-8");
		String searchURL;
		if(Math.random() > 0.5){
			searchURL = "https://www.google.com/#q=" + searchString;
		}
		else{
			searchURL = "http://www.bing.com/search?q=" + searchString;
		}
		
		ExternalContext context =FacesContext.getCurrentInstance().getExternalContext();
		HttpServletResponse response = (HttpServletResponse)context.getResponse();
		response.sendRedirect(searchURL);
		
		return null;
	}

}
