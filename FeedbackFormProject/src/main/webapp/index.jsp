<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sofia's Feedback Form</title>
    <link rel="stylesheet" href="<%= application.getContextPath() %>/css/styles.css">
</head>
<body>
    <div class="container">
        <div class="left-panel">
            <img src="<%= application.getContextPath() %>/img/background.jpg" alt="Background" class="background">
            <div class="tagline">
                <h1 style="font-weight:bold;">Welcome to Sofia's Blog</h1>
                
                <p style="font-style: italic;font-weight:bold;">Please submit your valuable feedback</p>
            </div>
        </div>
        <div class="right-panel">
            <div class="form-container">
                <h1>Feedback Form</h1>
                <p>We really value your feedback! &#128519;</p>
                <form action="<%= application.getContextPath() %>/feedback" method="post">
                    
                        <input type="text" name="first_name" placeholder="First name" required>
                        <input type="text" name="last_name" placeholder="Last name" required>
                    
                    <input type="email" name="email" placeholder="Email" required>
                    
                    <div class="form-group">	
                            <textarea id="feedback" name="feedback" placeholder="Enter your feedback here..." required></textarea>
                     </div>
                        
                    <div class="form-group checkbox">
                        <label for="terms"><input type="checkbox" id="terms" required>I agree to the <a href="#">Terms & Conditions</a></label>
                    </div>  
                    
                    <button type="submit" class="submit-btn">Submit</button>
                </form>
                
            </div>
        </div>
    </div>
</body>
</html>
