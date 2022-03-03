# Android Automation
Installation Guide of Appium

**1- JAVA:**    
---
1- Go to this website and download jdk file: 

**Website Link:** https://login.oracle.com/mysso/signon.jsp

2- Install java (Don’t change destination folder)

3- Setup environment variable. For that Go to This PC > right click > properties > advanced system settings > environment variable. Now, add path in system variable as

**Name:** JAVA_HOME

**Value:** C:\Program Files\Java\jdk1.8.0_291

4- Also, edit the “path” in the system variable as:

**Path:** C:\Program Files\Java\jdk1.8.0_291\bin

5- Go to cmd and write “java -version” to know if java is installed.
**Note:** To uninstall java, go to control panel > programs > Search java > Uninstall


**2- Android Studio**
----
1- Go to this website and download: 

**Website Link:** https://developer.android.com/studio?gclid=Cj0KCQiAip-PBhDVARIsAPP2xc29H20LpmsFgY6R7qnBg1-AqoFLo3YU-XM1SrMVcvw_BnFK1BHFkyQaAm9AEALw_wcB&gclsrc=aw.ds

2- Install it by clicking next

3- After installing, select do not import settings

4- Select standard

5- Set system variables

**Name:** ANDROID_HOME

**Value:** C:\Users\PakWheels\AppData\Local\Android\Sdk

6- Edit in path variable under system variables and add these:

C:\Users\PakWheels\AppData\Local\Android\Sdk\tools\bin

C:\Users\PakWheels\AppData\Local\Android\Sdk\tools

C:\Users\PakWheels\AppData\Local\Android\Sdk\platform-tools

**3. Appium**
---
There are two ways to install appium

**1- Appium through cmd**

1- First we need to install Node

2- Go to website and Download .msi file

**Website Link:** https://nodejs.org/en/download/

3- Click next and install node

4- Set system variables

**Name:** NODE_HOME

**Value:** C:\Program Files\nodejs

5- **Edit in path:** 

C:\Program Files\nodejs\node_modules\npm\bin

6- Go to cmd (administrator mode)

Run command: npm install -g appium

Rum command: appium (Allow access if needed > Port will be shown)

**Note:** To uninstall appium from command line, Run Command: npm uninstall -g appium

**2- Appium Client**

1- Go to link and download appium client exe file

**Website Link:** https://github.com/appium/appium-desktop/releases/tag/v1.22.0

2- Install appium server

Appium locator/inspector: https://github.com/appium/appium-inspector/releases

**4. Eclipse**
---
Download eclipse for java developers: 
Website Link: https://www.eclipse.org/downloads/packages/
Note: To uninstall eclipse, remove every file from PC
For example: Desktop/ Downloads or C:\Users\PakWheels\.eclipse or workspace

**5. Vysor:**
---
Install vysor on phone and laptop
Desktop app link:  https://www.vysor.io/download/
On the desktop app, start the play button.
Note: Mobile and laptop will be connected through a usb cable. 

**6. Setup Maven**
---
Go to link: https://mvnrepository.com/
Download dependencies (Copy code)
1. Java client: https://mvnrepository.com/artifact/io.appium/java-client
2. Selenium Java: https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
3. TestNG: https://mvnrepository.com/artifact/org.testng/testng 
Add dependencies in pom.xml under <dependencies> </dependencies>
Select project from headers > build automatically
Right click on project name > maven > update project > ok
Note: Never use beta version

**7. TestNG**
---
There are two ways to install testng.
1- Maven dependency
2- Eclipse new software

1- Maven dependency
Article Link: https://testng.org/doc/download.html
2- Eclipse new software
Help > install new software > Enter Site URL
Site URL: https://testng.org/testng-eclipse-update-site 
Press enter, it will be installed shortly

**8. Connect Real Android Device**
---
Article : https://developer.chrome.com/docs/devtools/remote-debugging/
Enabling developer options: Settings > About phone > Build number (Tap 7 times)
Enable USB debugging: Developer options > Check USB debugging > OK

Getting started with Project:
Right click on eclipse > New > Maven project > Enter project name/ ID
Right click src/test.java > new > class
Copy .apk file and paste in src
To check if device is connected, in cmd (as administrator) run command
Command: adb devices
To run appium from cmd (as administrator), run command
Command: appium
For opening Ui locator, in another cmd (as administrator) run command
Command: uiautomatorviewer
Note: For java class, Delete module-info.java to remove errors

**9. GitHub**
---
Go to github > Create account > Create new repository 
Website Link: https://github.com/

**10. Git**
---
Download git: 
Link: https://git-scm.com/download/win
Select next > Windows command prompt
Commands
git config –global user.name “Iqra”
git config –global user.email “iqrahabib477@gmail.com”
Create a folder in C drive: Pakwheels_Android_Automation
Go into that folder using cd command
git init (hidden file will be created)
git remote add origin “Github URL”
git add -A OR  git add *
git status
git commit -a OR git commit -m ”Comments”
git push origin master

**11. Extent Reports:**
---
Add maven dependency
Website Link: https://mvnrepository.com/artifact/com.aventstack/extentreports







