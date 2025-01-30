# CalciumSelnide IBM M122 Terminal Keyboard
# I used Daniele Paolo Scarpazza's IBM Config for reference and inspiration.

remapblock
  # Extra Function Key Bank (left side of keyboard)
  EXTRA_F2    ESC
  EXTRA_F3    SCROLL_LOCK
  EXTRA_F4    PRINTSCREEN
  EXTRA_F7    MEDIA_MY_COMPUTER
  EXTRA_F8    FN1
  EXTRA_F9    LGUI
  EXTRA_F10   RGUI

  # Reassign normal keys amidst the board as desired
  EUROPE_1    BACKSLASH         # Key on the inside of the L-shaped Enter key
  EUROPE_2    LSHIFT            # <> Key by LShift - just make it LShift

  # Configure the numeric pad to the traditional PC layout
  PAD_PLUS    PAD_ENTER         # num keypad: "Field +" becomes Enter
  NUM_LOCK    PAD_SLASH         # num keypad: traditional position of 
  ESC         NUM_LOCK          # The top, leftmost key on the numpad originally outputs Esc. Make it a NumLock
  PAD_ASTERIX INTERNATIONAL_9   # Rightmost column, second row - reassign
  PAD_MINUS   PAD_PLUS          # Rightmost column, third row  - reassign
  EXTRA_SYSRQ PAD_MINUS
  SCROLL_LOCK PAD_ASTERIX
  
endblock

macroblock
  # Make a Save Button macro
  macro LANG_4
    MAKE LCTRL
    PRESS S
    BREAK LCTRL
  endmacro

  # Make PANIC button
  macro EXTRA_F1
    MAKE LCTRL
    PRESS C
    BREAK LCTRL
  endmacro
endblock
