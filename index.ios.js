'use strict';
import React from 'react';
import { LinkingIOS } from 'react-native';

var LocationSettings = {
  open: () => {
          LinkingIOS.openURL('app-settings:');
        }
};

export default LocationSettings;
