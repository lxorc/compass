/*
 * Copyright 2023 OPPO.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.oppo.cloud.portal.config;

import com.oppo.cloud.portal.domain.task.UserInfoResponse;

/**
 *  User info caches in ThreadLocal
 */
public class ThreadLocalUserInfo {

    private static final ThreadLocal<UserInfoResponse> USER_THREAD_LOCAL = new ThreadLocal<>();

    /**
     * clear userinfo
     */
    public static void clear() {
        USER_THREAD_LOCAL.remove();
    }

    /**
     * save userinfo
     */
    public static void set(UserInfoResponse userInfo) {
        USER_THREAD_LOCAL.set(userInfo);
    }

    /**
     * get userinfo
     */
    public static UserInfoResponse getCurrentUser() {
        return USER_THREAD_LOCAL.get();
    }
}
