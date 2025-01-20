# Daniele Paolo Scarpazza
#
# Soarer's converter configuration file for IBM keyboard, Model M 122 Part Number 1395660,
# originally shipped with the IBM InfoWindow II Terminal.
#
# Remaps the keyboard for easily bindable emacs sequences that survive across Microsoft Remote Desktop and X-Windows sessions.
#
# Decisions are discussed in README.md.

remapblock
  PAD_PLUS    ENTER              # num keypad: "Field +" becomes Enter
  NUM_LOCK    SLASH              # num keypad: traditional position of 
  ESC         NUM_LOCK           # The top, leftmost key on the numpad originally outputs Esc. Make it a NumLock

  # EXTRA_F1    ESC
  EXTRA_F2    ESC
  EXTRA_F10   LGUI
  
  EUROPE_1    BACKSLASH          # Key on the inside of the L-shaped Enter key

  # Configure the numeric pad mostly according to the traditional PC layout
  #
  PAD_ASTERIX INTERNATIONAL_9   # Rightmost column, second row - reassign
  PAD_MINUS   PAD_PLUS          # Rightmost column, third row  - reassign
  EXTRA_SYSRQ PAD_MINUS
  SCROLL_LOCK PAD_ASTERIX
  
  # I don't have SCROLL_LOCK. Don't need it. Don't want it.
  
  # I remap CAPS_LOCK (pressed alone) to PAUSE, a code I'll remap to the "Compose" function, both in Linux and Windows, separately
  CAPS_LOCK PAUSE
endblock
