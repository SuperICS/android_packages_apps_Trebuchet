/*
 * Copyright (C) 2011 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.launcher2.preference;

import android.content.Context;
import android.content.SharedPreferences;

import com.android.launcher2.Workspace;
import com.android.launcher2.AppsCustomizePagedView;

public final class PreferencesProvider {
    public static final String PREFERENCES_KEY = "com.android.launcher2_preferences";

    public static final String PREFERENCES_CHANGED = "preferences_changed";

    public static class Interface {
        public static class Homescreen {
            public static int getNumberHomescreens(Context context) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                return preferences.getInt("ui_homescreen_screens", 5);
            }
            public static int getDefaultHomescreen(Context context, int def) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                return preferences.getInt("ui_homescreen_default_screen", def + 1) - 1;
            }
            public static boolean getShowSearchBar(Context context) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                return preferences.getBoolean("ui_homescreen_general_search", true);
            }
            public static boolean getResizeAnyWidget(Context context) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                return preferences.getBoolean("ui_homescreen_general_resize_any_widget", false);
            }
            public static class Scrolling {
                public static boolean getScrollWallpaper(Context context) {
                    final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                    return preferences.getBoolean("ui_homescreen_scrolling_scroll_wallpaper", true);
                }
                public static Workspace.TransitionEffect getTransitionEffect(Context context, String def) {
                    final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                    return Workspace.TransitionEffect.valueOf(
                            preferences.getString("ui_homescreen_scrolling_transition_effect", def));
                }
                public static boolean getFadeInAdjacentScreens(Context context, boolean def) {
                    final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                    return preferences.getBoolean("ui_homescreen_scrolling_fade_adjacent_screens", def);
                }
            }
            public static class Indicator {
                public static boolean getShowScrollingIndicator(Context context) {
                    final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                    return preferences.getBoolean("ui_homescreen_indicator_enable", true);
                }
                public static boolean getFadeScrollingIndicator(Context context) {
                    final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                    return preferences.getBoolean("ui_homescreen_indicator_fade", true);
                }
                public static boolean getShowDockDivider(Context context) {
                    final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                    return preferences.getBoolean("ui_homescreen_indicator_background", true);
                }
            }
        }

        public static class Drawer {
            public static boolean getJoinWidgetsApps(Context context) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                return preferences.getBoolean("ui_drawer_widgets_join_apps", true);
            }
            public static class Scrolling {
                public static AppsCustomizePagedView.TransitionEffect getTransitionEffect(Context context, String def) {
                    final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                    return AppsCustomizePagedView.TransitionEffect.valueOf(
                            preferences.getString("ui_drawer_scrolling_transition_effect", def));
                }
                public static boolean getFadeInAdjacentScreens(Context context) {
                    final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                    return preferences.getBoolean("ui_drawer_scrolling_fade_adjacent_screens", false);
                }
            }
            public static class Indicator {
                public static boolean getShowScrollingIndicator(Context context) {
                   final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                    return preferences.getBoolean("ui_drawer_indicator_enable", true);
                }
                public static boolean getFadeScrollingIndicator(Context context) {
                    final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                    return preferences.getBoolean("ui_drawer_indicator_fade", true);
                }
            }
        }

        public static class Dock {

        }

        public static class Icons {

        }

        public static class General {
            public static boolean getAutoRotate(Context context, boolean def) {
                final SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, 0);
                return preferences.getBoolean("ui_general_orientation", def);
            }
        }
    }

    public static class Application {

    }
}
