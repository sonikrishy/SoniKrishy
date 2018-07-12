
import unittest
from random import randint
from time import sleep

from selenium import webdriver
from selenium.webdriver.support.select import Select


class AddEmployee(unittest.TestCase): # using camelcase as class names r usually capitalized

    def setUp(self):
        self.driver = webdriver.Chrome(executable_path='/Users/soniyasinghal/PycharmProjects/HRM_Spring2018/browser_drivers/chromedriver')
        #click on red underline, red bulb appears, click on it, do import from name
        # select selenium.webdriver/last option

        # put cursor after '.', press ctrl + space
        # better to add 'executable path' text before path

        self.driver.get('http://hrm.seleniumminutes.com')


    def tearDown(self): # use self one not class one
        self.driver.quit()


    def test_something(self):
        # Login
        empId = randint(100000, 999999)
        expected_first_name = 'Sonia'
        expected_last_name = 'Bindal'
        expected_job_title = 'QA Manager'
        expected_emp_status = 'Full-time'

        driver = self.driver
        driver.find_element_by_id('txtUsername').send_keys('admin')
        driver.find_element_by_id('txtPassword').send_keys('Password')
        driver.find_element_by_id('btnLogin').click()

        sleep(2)

        welcome_text = driver.find_element_by_id('welcome').text
        self.assertEqual('Welcome Admin', welcome_text)

        # Click Add button
        driver.find_element_by_id('menu_pim_viewPimModule').click()
        driver.find_element_by_id('btnAdd').click()
        # TODO SS: may need to come back to do something


        # Enter first and last name
        driver.find_element_by_id('firstName').send_keys(expected_first_name)
        driver.find_element_by_id('lastName').send_keys(expected_last_name)

        # enter and remember the empId
        driver.find_element_by_id('employeeId').clear()
        driver.find_element_by_id('employeeId').send_keys(empId)

        # save the employee
        driver.find_element_by_id('btnSave').click()

        driver.find_element_by_link_text('Job').click()
        # ToDo may need sleep

        driver.find_element_by_id('btnSave').click()
        #TODO may need sleep

        Select(driver.find_element_by_id('job_job_title')).select_by_visible_text(expected_job_title)
        Select(driver.find_element_by_id('job_emp_status')).select_by_visible_text(expected_emp_status)
        driver.find_element_by_id('btnSave').click()
        # TODO may need sleep

        # go to PIM page
        driver.find_element_by_id('menu_pim_viewPimModule').click()
        # TODO SS: may need to come back to do something

        # search by empid
        driver.find_element_by_id('empsearch_id').send_keys(empId)
        driver.find_element_by_id('searchBtn').click()

        # expected: 1 record back
        # find all occurences of firstname & check length of list returned
        lst = driver.find_elements_by_xpath("//td[3]/a")
        self.assertTrue(len(lst) == 1)

        # expected correct full name and emp id (not doing now)
        firstName = driver.find_element_by_xpath("//td[3]/a").text
        lastName = driver.find_element_by_xpath("//td[4]/a").text
        job_title = driver.find_element_by_xpath("//td[5]").text
        emp_status = driver.find_element_by_xpath("//td[6]").text

        message = "Expected the table to contain first name '{0}' but instead the value was {1}"
        self.assertEqual(expected_first_name, firstName, message.format(expected_first_name, firstName))
        self.assertEqual(expected_last_name, lastName)
        self.assertEqual(expected_job_title, job_title)
        self.assertEqual(expected_emp_status, emp_status)


if __name__ == '__main__':
    unittest.main()
