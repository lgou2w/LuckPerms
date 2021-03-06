/*
 * This file is part of LuckPerms, licensed under the MIT License.
 *
 *  Copyright (c) lucko (Luck) <luck@lucko.me>
 *  Copyright (c) contributors
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

package me.lucko.luckperms.common.event.impl;

import me.lucko.luckperms.api.event.cause.DeletionCause;
import me.lucko.luckperms.api.event.track.TrackDeleteEvent;
import me.lucko.luckperms.common.event.AbstractEvent;

import java.util.List;

import javax.annotation.Nonnull;

public class EventTrackDelete extends AbstractEvent implements TrackDeleteEvent {

    private final String trackName;
    private final List<String> existingData;
    private final DeletionCause cause;

    public EventTrackDelete(String trackName, List<String> existingData, DeletionCause cause) {
        this.trackName = trackName;
        this.existingData = existingData;
        this.cause = cause;
    }

    @Nonnull
    @Override
    public String getTrackName() {
        return this.trackName;
    }

    @Nonnull
    @Override
    public List<String> getExistingData() {
        return this.existingData;
    }

    @Nonnull
    @Override
    public DeletionCause getCause() {
        return this.cause;
    }

    @Override
    public String toString() {
        return "EventTrackDelete(trackName=" + this.getTrackName() + ", existingData=" + this.getExistingData() + ", cause=" + this.getCause() + ")";
    }
}
