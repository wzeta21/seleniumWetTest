login:
user: wzeta21@gmail.com
pwd: pwd.12345

login fields:
click login --> //div[contains(@class,'navRow_236y3 container')]/ul/li/a[text()='Sign In']
email --> id:emailOrPhone -->//input[@id="emailOrPhone"]
pwd --> id:password --> //input[@id="password"]
click boton Sign In --> //button[text()='Sign In']

main page: user image (item) --> //div[@id='tl-bar-user']/img



Add list:
click at add list --> //p[text()='Lists']//following-sibling::button
                    
fill task name: -->//input[@id='edit-project-name']
click save: //button[text()='Save']
displary tast: //p[text()='zetaTask']

edit:

click en tres puntos: //p[text()='ZetaTask1671256400403']//following-sibling::div//following-sibling::div[contains(@class, 'flex-none')]

