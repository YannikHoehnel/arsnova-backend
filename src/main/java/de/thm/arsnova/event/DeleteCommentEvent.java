/*
 * This file is part of ARSnova Backend.
 * Copyright (C) 2012-2018 The ARSnova Team and Contributors
 *
 * ARSnova Backend is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ARSnova Backend is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.thm.arsnova.event;

import de.thm.arsnova.model.Comment;
import de.thm.arsnova.model.Room;

/**
 * Fires whenever an comment is deleted.
 */
public class DeleteCommentEvent extends RoomEvent {

	private static final long serialVersionUID = 1L;

	private final Comment comment;

	public DeleteCommentEvent(Object source, Room room, Comment comment) {
		super(source, room);
		this.comment = comment;
	}

	@Override
	public void accept(ArsnovaEventVisitor visitor) {
		visitor.visit(this);
	}

	public Comment getQuestion() {
		return comment;
	}

}
