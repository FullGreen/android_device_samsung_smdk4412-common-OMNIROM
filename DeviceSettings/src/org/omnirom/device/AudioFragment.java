/*
* Copyright (C) 2012 The CyanogenMod Project
*               2015 The OmniROM Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.omnirom.device;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceFragment;

public class AudioFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.audio_preferences);

        // Dock Audio
        if (!DockAudio.isSupported(getActivity())) {
            findPreference(DockAudio.KEY_USE_DOCK_AUDIO).setEnabled(false);
        }
    }

    public static void restore(Context context) {
        DockAudio.restore(context);
    }
}