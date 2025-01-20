#!/usr/bin/env python3
import os

class installWizard():
    def __init__(self):
        self.supportedPackageManagers = ['apt']

    def cast(self, packageManager:str, dependency:list):
        if packageManager in self.supportedPackageManagers:
            if packageManager == 'apt':
                status = os.system('sudo apt-get update')
                
                for package in dependency:
                    status = os.system('sudo apt-get install ' + package)

    def go(self, path:str):
        os.chdir(path)

    def chant(self, cmd:str):
        os.system(cmd)
