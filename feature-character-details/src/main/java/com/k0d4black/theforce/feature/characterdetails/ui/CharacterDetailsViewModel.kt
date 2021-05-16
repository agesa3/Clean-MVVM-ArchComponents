/**
 *
 * Copyright 2020 David Odari
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *          http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 **/
package com.k0d4black.theforce.feature.characterdetails.ui

import androidx.lifecycle.ViewModel
import com.k0d4black.theforce.shared.characters.FavoriteCharactersDataSource
import com.k0d4black.theforce.shared.films.FilmsDataSource
import com.k0d4black.theforce.shared.planets.PlanetsDataSource
import com.k0d4black.theforce.shared.species.SpeciesDataSource

internal class CharacterDetailsViewModel(
    private val planetsDataSource: PlanetsDataSource,
    private val filmsDataSource: FilmsDataSource,
    private val speciesDataSource: SpeciesDataSource,
    private val favoriteCharactersDataSource: FavoriteCharactersDataSource
) : ViewModel() {

}
