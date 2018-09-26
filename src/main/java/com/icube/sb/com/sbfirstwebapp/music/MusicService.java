package com.icube.sb.com.sbfirstwebapp.music;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MusicService {
	
	private List<MusicTrack> music = Arrays.asList(
			new MusicTrack("telugu","Devadas","comedy","samu"),
				new MusicTrack("telugu","chalo","comedy","srrinath"),
				new MusicTrack("telugu","a aa","Logical","3vkram"),
				new MusicTrack("telugu","svsc","family","srikanthaddala"),
				new MusicTrack("telugu","Bahubhali","epic","Rajamouli"),
				new MusicTrack("telugu","UGS","Lovestory","Avsarala"),
				new MusicTrack("telugu","UTURN","suspense","vvn"),
				new MusicTrack("telugu","vRA","family","raju"),
				new MusicTrack("telugu","mahanati","Biopic","aswiniDutt"),
				new MusicTrack("tamil","robo","Techst","sankar"),
				new MusicTrack("tamil","villan","action","maniratnam"),
				new MusicTrack("tamil","vishali","family","raju"),
				new MusicTrack("tamil","Ba","epic","Rajamouli"),
				new MusicTrack("tamil","chandramuki","horror","das"),
				new MusicTrack("tamil","surya s/0 kishn","Lovestory","ARRahman"),
				new MusicTrack("tamil","MRA","family","ram"),
				new MusicTrack("tamil","mahi","Biopic","Dutt"),
				new MusicTrack("hindi","chennai exp","entertainment","kram"),
				new MusicTrack("hindi","rbdj","family","ika"),
				new MusicTrack("hindi","bhali","epic","Rajamouli"),
				new MusicTrack("hindi","UGSa","Lovestory","rala"),
				new MusicTrack("hindi","VTURN","suspense","uun"),
				new MusicTrack("hindi","MiRA","family","aju"),
				new MusicTrack("hindi","mahinati","Biopic","aswini"),
				new MusicTrack("malayalam","core","edy","rr"),
				new MusicTrack("malayalam","premam","Logical","john"),
				new MusicTrack("malayalam","opal","family","kanth"),
				new MusicTrack("malayalam","veera","epic","mouli"),
				new MusicTrack("malayalam","kousuki","moral","Avs"),
				new MusicTrack("malayalam","zen","suspense","zzn"),
				new MusicTrack("malayalam","YYR","family","raju"),
				new MusicTrack("malayalam","Omi","Biopic","iniDut"),
				new MusicTrack("malayalam","comb","edy","rr"),
				new MusicTrack("english","twiligh","Logical","john"),
				new MusicTrack("english","avengers","family","kanth"),
				new MusicTrack("english","zurassic","epic","michel"),
				new MusicTrack("english","tom and jerry","moral","Ajoy"),
				new MusicTrack("english","harrypotter","suspense","zyterx"),
				new MusicTrack("english","the nun","family","rome"),
				new MusicTrack("punjabi","sohanl","Techst","sankar"),
				new MusicTrack("punjabi","shawn","action","maniratnam"),
				new MusicTrack("punjabi","sulekha","family","raju"),
				new MusicTrack("punjabi","cary","epic","Rajamouli"),
				new MusicTrack("punjabi","chole","horror","das"),
				new MusicTrack("punjabi","mysore","Lovestory","ARRahman"),
				new MusicTrack("punjabi","mosy","family","ram"),
				new MusicTrack("punjabi","maiami" ,"Biopic","Dutt")
			
				);
		
			public List<MusicTrack> getAllMusic(){
				return music;
				
			}

			public MusicTrack getMusic(String album) {
				return music.stream().filter(t->t.getAlbum()
						
						.equals(Album)).findAny().get();			
			}
		

}
