import unittest
from time import sleep

from selenium import webdriver

class MyTestCase(unittest.TestCase):


    # setUp will get executes by unittest once for every function which starts with 'test'
    def setUp(self):
        self.driver = webdriver.Chrome(executable_path='/Users/soniyasinghal/PycharmProjects/HRM_Spring2018/browser_drivers/chromedriver')
        self.driver.get("http://hrm.seleniumminutes.com/")

    # it is also wise to add a tearDown() function


    def test_valid_login(self):
        driver = self.driver
        driver.find_element_by_id('txtUsername').send_keys('admin')
        driver.find_element_by_id('txtPassword').send_keys('Password')
        driver.find_element_by_id('btnLogin').click()

        sleep(2)

        welcome_text = driver.find_element_by_id('welcome').text
        self.assertEqual('Welcome Admin', welcome_text)

        dashboard_text = driver.find_element_by_id('menu_dashboard_index').text
        self.assertEqual('Dashboard', dashboard_text)


    def test_invalid_password_login(self):   # test_invalid_password - may use this name
        driver = self.driver
        driver.find_element_by_id('txtUsername').send_keys('admin')
        driver.find_element_by_id('txtPassword').send_keys('password')
        driver.find_element_by_id('btnLogin').click()

        sleep(2)

        login_panel_text = driver.find_element_by_id('logInPanelHeading').text
        self.assertEqual('LOGIN Panel', login_panel_text)

        span_message_text = driver.find_element_by_id('spanMessage').text
        # can use name 'warning_text'

        self.assertEqual('Invalid credentials', span_message_text)


    def test_invalid_empty_password_login(self):    #test_empty_password
        driver = self.driver
        driver.find_element_by_id('txtUsername').send_keys('admin')
        driver.find_element_by_id('txtPassword').clear()
        # .clear(), .sendkeys('') or no statement - all fine

        driver.find_element_by_id('btnLogin').click()

        sleep(2)

        login_panel_text = driver.find_element_by_id('logInPanelHeading').text
        self.assertEqual('LOGIN Panel', login_panel_text)

        span_message_text = driver.find_element_by_id('spanMessage').text
        self.assertEqual('Password cannot be empty', span_message_text)

    # test case class ends here

if __name__ == '__main__':
    unittest.main()
