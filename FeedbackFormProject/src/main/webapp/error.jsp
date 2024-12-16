<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error - Feedback Submission</title>
    <link rel="stylesheet" href="<%= application.getContextPath() %>/css/styles.css">
</head>
<body>
    <div class="container">
        <div class="left-panel">
            <img src="<%= application.getContextPath() %>/img/error-img.gif" alt="Background" class="background">
            <!-- <div class="tagline">
                <h1 style="font-weight:bold;">Oops! Something Went Wrong</h1>
                <p style="font-style: italic; font-weight:bold;">Please try again later.</p>
            </div> -->
        </div>
        <div class="right-panel">
            <div class="form-container">
                <h1>Error</h1>
                <p>We encountered an error while processing your feedback. &#128577;</p>
                <a href="<%= application.getContextPath() %>/feedback" class="submit-btn" style="color: red;">Try Again</a>
            </div>
        </div>
    </div>
</body>
</html>