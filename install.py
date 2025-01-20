#!/usr/bin/env python3
import sys
sys.path.append('py_utils')

from dependency import installWizard

dependencies = ['libusb-1.0-0-dev', 'libhidapi-libusb0', 'pkg-config']

wizard = installWizard()
wizard.cast('apt', dependencies)

wizard.go('./src_sctools')
wizard.chant('./autogen.sh')
wizard.chant('make')
wizard.chant('sudo make install')
