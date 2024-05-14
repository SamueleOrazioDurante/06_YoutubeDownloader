<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!doctype html>
<html class="h-full bg-white dark:bg-gray-900">
  <head>
    <meta charset="UTF-8" />
    <title>YT-Downloader</title>
    <link rel="icon" href="https://upload.wikimedia.org/wikipedia/commons/e/ef/Youtube_logo.png" type="image/png" />
	<link rel="stylesheet" href="WebContent/style/index.css">
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
        <form class="mx-auto max-w-md" action="search" method="POST">
          <label for="default-search" class="sr-only mb-2 text-sm font-medium text-gray-900 dark:text-white">Search</label>
          <div class="relative">
            <div class="pointer-events-none absolute inset-y-0 start-0 flex items-center ps-3">
              <svg class="h-4 w-4 text-gray-500 dark:text-gray-400" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 20 20">
                <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="m19 19-4-4m0-7A7 7 0 1 1 1 8a7 7 0 0 1 14 0Z" />
              </svg>
            </div>
            <input type="search" id="query" name="query" class="block w-full rounded-lg border border-gray-300 bg-gray-50 p-4 ps-10 text-sm text-gray-900 focus:border-red-500 focus:ring-red-500 dark:border-gray-600 dark:bg-gray-700 dark:text-white dark:placeholder-gray-400 dark:focus:border-red-500 dark:focus:ring-red-500" placeholder="Search YouTubes Titles, Links..." required />
            <button type="submit" class="absolute bottom-2.5 end-2.5 rounded-lg bg-red-700 px-4 py-2 text-sm font-medium text-white hover:bg-red-800 focus:outline-none focus:ring-4 focus:ring-red-300 dark:bg-red-600 dark:hover:bg-red-700 dark:focus:ring-red-800">Search</button>
          </div>
        </form>
      </section><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    </div>
    
  </body>
</html>
