<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*"%>
<%@ page import = "model.Video,model.Image,model.VideoesList"%>    
   
<!doctype html>
<html class="h-full bg-white dark:bg-gray-900">
  <head>
    <meta charset="UTF-8" />
    <title>YT-Downloader</title>
    <link rel="icon" href="https://upload.wikimedia.org/wikipedia/commons/e/ef/Youtube_logo.png" type="image/png" />
	<link rel="stylesheet" href="style/viewSearchedVideoes.css">
	<link rel="stylesheet" href="WebContent/style/viewSearchedVideoes.css">
  </head>

  <body class="h-full dark:bg-gray-900">
    <div class="bg-gray-50 antialiased dark:bg-gray-900">
      <header class="body-font border-b border-gray-200 text-gray-700 dark:bg-gray-900">
        <div class="container mx-auto flex flex-col flex-wrap items-center p-5 md:flex-row">
          <a class="title-font mb-4 flex items-center font-medium text-gray-900 md:mb-0" href="#" target="_blank">
            <svg xmlns="http://www.w3.org/2000/svg" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="h-10 w-10 rounded-full bg-red-500 p-2 text-white" viewBox="0 0 24 24">
              <path d="M12 2L2 7l10 5 10-5-10-5zM2 17l10 5 10-5M2 12l10 5 10-5"></path>
            </svg>
            <span class="ml-3 text-xl dark:text-white">YouTube Downloader </span>
          </a>
        </div>
      </header>
      <br /><br /><br /><br /><br />
      <section class="body-font text-gray-700 dark:bg-gray-900">
        <div class="holder mx-auto w-10/12 grid sm:grid-cols-1 md:grid-cols-3 lg:grid-cols-4">
        
		<%
		
		VideoesList videoesList = (VideoesList) request.getAttribute("videoesList");
		
        ArrayList<Video> videoes = videoesList.getVideoes();
        
        for(int i = 0;i<videoes.size();i++){
        	Video video = videoes.get(i);
        	Image image = video.getThumbnail();
        %>
        	<!-- each element-->
          
	          <div class="each mb-10 m-2 shadow-lg border-gray-800 bg-gray-100 relative dark:bg-gray-800">
	            <a href="WebContent/selectFormat.jsp?id=<%=video.getId() %>">
	            <img class="w-full" src="<%=image.getUrl() %>" alt="" />
	            </a>
	            <div class="badge absolute top-0 right-0 bg-red-500 m-1 text-gray-200 p-1 px-2 text-xs font-bold rounded"><%=video.getVideo_lenght() %></div>
	            <div class="info-box text-xs flex p-1 font-semibold text-gray-500 bg-gray-300 dark:bg-gray-700 dark:text-gray-300">
	              <span class="mr-1 p-1 px-2 font-bold"><%=video.getViews() %> views</span>
	            </div>
	            <div class="desc p-4 text-gray-800 dark:text-white">
	              <a href="https://www.youtube.com/watch?v=<%=video.getId() %>" target="_new" class="title font-bold block cursor-pointer hover:underline"><%=video.getTitle() %></a>
	              <a href="https://www.youtube.com/user/<%=video.getAuthor() %>" target="_new" class="badge bg-red-500 text-blue-100 rounded px-1 text-xs font-bold cursor-pointer">@<%=video.getAuthor() %></a>
	              <span class="description text-sm block py-2 border-gray-400 mb-2"><%=video.getDescription() %></span>
	            </div>
	          </div>
          
          <%} %>

        </div>
      </section><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    </div>
    
  </body>
</html>