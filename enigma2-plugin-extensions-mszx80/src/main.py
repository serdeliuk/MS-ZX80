# -*- coding: utf-8 -*-
# code by Marc Serdeliuc

from enigma import eConsoleAppContainer, fbClass, eRCInput
from Screens.Screen import Screen
from Screens.ServiceStopScreen import ServiceStopScreen

from Components.Pixmap import Pixmap
from enigma import ePicLoad
from enigma import eTimer

class fuse(Screen, ServiceStopScreen):

	skin="""
		<screen name="fuse" position="0,0" size="1,1" title="MS-ZX80" backgroundColor="black" flags="wfNoBorder">
		<widget name="pic" position="0,0" size="1,1" alphatest="on" />
		</screen>"""
		
	def __init__(self, session):
		Screen.__init__(self, session)

		self.oldService = session.nav.getCurrentlyPlayingServiceReference()
		session.nav.stopService()
		ServiceStopScreen.__init__(self)

		self["pic"] = Pixmap()
		self.picload = ePicLoad()
		self.picload.PictureData.get()
		ptr = self.picload.getData()
		if ptr is not None:
		    self["pic"].instance.setPixmap(ptr.__deref__())
		    self["pic"].show()
		self.picload.getThumbnail('/home/root/Extensions/MS-ZX80/ms-zx80.png', 100, 100)
		self["pic"].show()
		self.startEmuTimer = eTimer()
		self.startEmuTimer.start(2, False)
		self.startEmuTimer.callback.append(self.timed_start)

		self.stopService()
		self.container=eConsoleAppContainer()
		self.container.appClosed.append(self.runDone)

	def runEmu(self):
		eRCInput.getInstance().lock()
		fbClass.getInstance().lock()
		cmd = "/usr/bin/fuse >> /tmp/fuse.txt 2>&1;"
		self.container.execute(cmd)

	def runDone(self,retval=1):
		self.session.nav.playService(self.oldService)
		fbClass.getInstance().unlock()
		eRCInput.getInstance().unlock()
		self.close()

	def timed_start(self):
	    self.startEmuTimer.stop()
	    self["pic"].show()
	    self.runEmu()

def main(session, **kwargs):
	session.open(PictureScreen)
