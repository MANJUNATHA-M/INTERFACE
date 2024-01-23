package com.inter.example;


interface InterFacePost {

	public String PostName="Classic Style";
	public int NumbrOfPost=5;

	public void like();
	public void share();
	public void comment();

}
interface PhotoEdit 
{
	public void addSong();
}
interface VideoEdit
{
	public void muteVoice();
}

class Photo implements PhotoEdit ,VideoEdit,InterFacePost
{
	double size=10.0;

	public void addfilter()
	{
		System.out.println("FILTER IS ADDED FOR PHOTO");
	}

	@Override
	public void addSong()
	{
		System.out.println("PHOTO added and Added Song for that 🎈 ");
	}

	@Override
	public void muteVoice() 
	{
		System.out.println("PHOTO added and Removed Voice from that 🎃 ");
	}

	@Override
	public void like() 
	{
		System.out.println("photo liked ❤");
		
	}

	@Override
	public void share() 
	{
		System.out.println("photo as been shared 🔀");
		
	}

	@Override
	public void comment() 
	{
	System.out.println("commented for photo (•_•)");
		
	}
}

class Video implements PhotoEdit ,VideoEdit, InterFacePost
{
	String VideoSize="30.0s";

	public void trim()
	{
		System.out.println("video as been trimed as per the instraction");
	}

	@Override
	public void muteVoice() 
	{
		System.out.println("voice as been down by using mutevoice() ");
	}

	@Override
	public void addSong()
	{

		System.out.println("song as been added by to video Class");
	}
	
	@Override
	public void like() 
	{
		System.out.println("video liked ❤");
		
	}

	@Override
	public void share() 
	{
		System.out.println("Video as been shared 🔀");
		
	}

	@Override
	public void comment() 
	{
	System.out.println("commented for video (•_•)");
		
	}

}
public class MainMethodInterFace
{
	public static void main(String[] args) 
	{
	
		Photo photo=new Photo();
		System.out.println("");
		photo.addfilter();
		photo.addSong();
		photo.comment();
		photo.like();
		photo.share();
		photo.muteVoice();
		System.out.println("");
		System.out.println(" ------ DETAILS OF PHOTO ------");
		System.out.println("PHOTO SIZE --> "+photo.size);
		System.out.println("NUMBER OF PHOTOS --> "+photo.NumbrOfPost);
		System.out.println("PHOTO POST NAME --> "+photo.PostName);
		System.out.println(" ------ DETAILS OF PHOTO ------");
		System.out.println("");
		
		Video video=new Video();
		System.out.println("");
		video.addSong();
		video.comment();
		video.like();
		video.share();
		video.muteVoice();
		System.out.println("");
		System.out.println(" ------ DETAILS OF VIDEO ------");
		System.out.println("VIDEO SIZE --> "+video.VideoSize);
		System.out.println("NUMBER OF VIDEOS --> "+video.NumbrOfPost);
		System.out.println("VIDEO POST NAME --> "+video.PostName);
		System.out.println(" ------ DETAILS OF VIDEO ------");
		
		
	}
	
}