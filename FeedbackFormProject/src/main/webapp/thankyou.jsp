<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thank You - Feedback Submission</title>
    <link rel="stylesheet" href="<%= application.getContextPath() %>/css/styles.css">
</head>
<body>
    <div class="container">
        <div class="left-panel">
            <img src="<%= application.getContextPath() %>/img/thank-you-img.gif" alt="Background" class="background">
            <!-- <div class="tagline">
                <h1 style="font-weight:bold;">Thank You!</h1>
                <p style="font-style: italic; font-weight:bold;">Your feedback is invaluable to us.</p>
            </div> -->
        </div>
        <div class="right-panel">
            <div class="form-container">
                <h1>Submission Successful</h1>
                <p>We have received your feedback. &#128522;</p>
               <a href="<%= application.getContextPath() %>/feedback" class="submit-btn" style="color: red;">Submit another Feedback</a>

            </div>
        </div>
    </div>
</body>
</html>
