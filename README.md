Lviv 2016
=========
Some project for test deploying war file to [heroku][1].

Guide
-----
- **Step #1** - [Download][2] & install Heroku CLI
- **Step #2** - Log in using the email & password
```
heroku login
```
- **Step #3** - Clone this repo & open created directory
```
git clone https://github.com/alexiuscrow/lviv2016.git
cd lviv2016
```
- **Step #4** - Create an app on Heroku
```
heroku create
```
- **Step #5** - Deploy your code to Heroku
```
git push heroku master
```
- **Step #6** - Rename yor app
```
heroku apps:rename beautifulname
```
- **Step #7** - Run your application instance
```
heroku ps:scale web=1
```
- **Step #8** - Test
```
curl -X GET "https://beautifulname.herokuapp.com/countdown" -v
```

[2]: https://devcenter.heroku.com/articles/getting-started-with-java#set-up
[1]: heroku.com


