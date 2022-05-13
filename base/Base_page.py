from selenium import webdriver
from time import sleep

class BasePage:
    def __init__(self,driver):
        self.driver = driver
        self.driver.implicitly_wait(10)

    def open(self,url):
        self.driver.get(url)

    def locate(self, name, value):
        return self.driver.find_element(name,value)

    def input(self,name,value,txt):
        self.locate(name,value).send_keys(txt)

    def click(self,name,value):
        self.locate(name,value).click()

    def sleep(self,time_):
        sleep(time_)

    def quit(self):
        self.driver.quit()