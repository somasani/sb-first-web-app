package com.icube.sb.com.sbfirstwebapp.movies;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	private List<MovieItem> movies = Arrays.asList(
			new MovieItem("telugu","Devadas","comedy","samu","nani and nag"),
				new MovieItem("telugu","chalo","comedy","srrinath","nagashourya"),
				new MovieItem("telugu","a aa","Logical","3vkram","nitin"),
				new MovieItem("telugu","svsc","family","srikanthaddala","venkatesh"),
				new MovieItem("telugu","Bahubhali","epic","Rajamouli","prabhas"),
				new MovieItem("telugu","UGS","Lovestory","Avsarala","nagashourya"),
				new MovieItem("telugu","UTURN","suspense","vvn","samantha"),
				new MovieItem("telugu","vRA","family","raju","chai"),
				new MovieItem("telugu","mahanati","Biopic","aswiniDutt","Keerthisureesh"),
				new MovieItem("tamil","robo","Techst","sankar","rajanikanth"),
				new MovieItem("tamil","villan","action","maniratnam","vikram"),
				new MovieItem("tamil","vishali","family","raju","aadi"),
				new MovieItem("tamil","Ba","epic","Rajamouli","prabhas"),
				new MovieItem("tamil","chandramuki","horror","das","jyothika"),
				new MovieItem("tamil","surya s/0 kishn","Lovestory","ARRahman","soorya"),
				new MovieItem("tamil","MRA","family","ram","fai"),
				new MovieItem("tamil","mahi","Biopic","Dutt","Keerthi"),
				new MovieItem("hindi","chennai exp","entertainment","kram","sharuk"),
				new MovieItem("hindi","rbdj","family","ika","anushkasharma"),
				new MovieItem("hindi","bhali","epic","Rajamouli","prabhas"),
				new MovieItem("hindi","UGSa","Lovestory","rala","nourya"),
				new MovieItem("hindi","VTURN","suspense","uun","sammy"),
				new MovieItem("hindi","MiRA","family","aju","chai"),
				new MovieItem("hindi","mahinati","Biopic","aswini","Keerthi"),
				new MovieItem("malayalam","core","edy","rr","hour"),
				new MovieItem("malayalam","premam","Logical","john","nivinpaul"),
				new MovieItem("malayalam","opal","family","kanth","kat"),
				new MovieItem("malayalam","veera","epic","mouli","rabh"),
				new MovieItem("malayalam","kousuki","moral","Avs","ns"),
				new MovieItem("malayalam","zen","suspense","zzn","samantha"),
				new MovieItem("malayalam","YYR","family","raju","chai"),
				new MovieItem("malayalam","Omi","Biopic","iniDut","his"),
				new MovieItem("malayalam","comb","edy","rr","hour"),
				new MovieItem("english","twiligh","Logical","john","bohn"),
				new MovieItem("english","avengers","family","kanth","karan"),
				new MovieItem("english","zurassic","epic","michel","jill"),
				new MovieItem("english","tom and jerry","moral","Ajoy","allgood"),
				new MovieItem("english","harrypotter","suspense","zyterx","katy"),
				new MovieItem("english","the nun","family","rome","kire"),
				new MovieItem("punjabi","sohanl","Techst","sankar","rajanikanth"),
				new MovieItem("punjabi","shawn","action","maniratnam","vikram"),
				new MovieItem("punjabi","sulekha","family","raju","aadi"),
				new MovieItem("punjabi","cary","epic","Rajamouli","prabhas"),
				new MovieItem("punjabi","chole","horror","das","jyothika"),
				new MovieItem("punjabi","mysore","Lovestory","ARRahman","soorya"),
				new MovieItem("punjabi","mosy","family","ram","fai"),
				new MovieItem("punjabi","maiami" ,"Biopic","Dutt","Keerthi")
			
				);
		
			public List<MovieItem> getAllMovies(){
				return movies;
				
			}

			public MovieItem getMovie(String language) {
				return movies.stream().filter(t->t.getLanguage().equals(language)).findAny().get();			
			}
			
			public MovieItem getMovieTitle(String actor) {
				 return movies.stream().filter(t->t.getActor().equals(actor)).findFirst().get();
				
			}

}
