/*
 *     Copyright 2015-2018 Austin Keener & Michael Ritter & Florian Spieß
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
package net.dv8tion.jda.core.entities;

import net.dv8tion.jda.core.JDA;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface VoiceState
{
    /**
     * Returns whether the {@link net.dv8tion.jda.core.entities.Member Member}/{@link net.dv8tion.jda.core.entities.User User}
     * muted themselves.
     *
     * @return The User's self-mute status
     */
    boolean isSelfMuted();

    /**
     * Returns whether the {@link net.dv8tion.jda.core.entities.Member Member}/{@link net.dv8tion.jda.core.entities.User User}
     * deafened themselves.
     *
     * @return The User's self-deaf status
     */
    boolean isSelfDeafened();

    /**
     * Returns the {@link net.dv8tion.jda.core.JDA JDA} instance of this VoiceState
     *
     * @return The corresponding JDA instance
     */
    @Nonnull
    JDA getJDA();

    /**
     * The possibly-null {@link net.dv8tion.jda.core.entities.AudioChannel AudioChannel} for this VoiceState
     *
     * @return A possibly-null AudioChannel
     */
    @Nullable
    AudioChannel getAudioChannel();

    /**
     * The Session-Id for this VoiceState
     *
     * @return The Session-Id
     */
    @Nullable
    String getSessionId();
}
